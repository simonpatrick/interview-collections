# -*- coding: utf-8 -*-
import os
from collections import deque
from itertools import islice

# islice is generator
with open('sample_text.txt','r') as file:
    for line in islice(file,10):
        print(line)
    # to slow when big file
    for line in deque(file,maxlen=20):
        print(line)


def tail(fname,lines):
    """
    reading the last N lines from file fname
    :param fname:
    :param lines:
    :return:
    """

    with open(fname,'r') as f:
        BUFFER_SIZE=1024
        f.seek(0,os.SEEK_END)
        fsize=f.tell()
        block=-1
        data=""
        exit_flag=False
        while not exit_flag:
            step=(block*BUFFER_SIZE)
            if abs(step)>=fsize:
                f.seek(0)
                exit_flag=True
            else:
                f.seek(step,os.SEEK_END)
            data=f.read().strip()
            if data.count('\n') >= lines:
                break
            else:
                block -= 1
    return data.splitlines()[-lines:]


class File(file):
    """ An helper class for file reading  """

    def __init__(self, *args, **kwargs):
        super(File, self).__init__(*args, **kwargs)
        self.BLOCKSIZE = 4096

    def head(self, lines_2find=1):
        self.seek(0)                            #Rewind file
        return [super(File, self).next() for x in xrange(lines_2find)]

    def tail(self, lines_2find=1):
        self.seek(0, 2)                         #Go to end of file
        bytes_in_file = self.tell()
        lines_found, total_bytes_scanned = 0, 0
        while (lines_2find + 1 > lines_found and
               bytes_in_file > total_bytes_scanned):
            byte_block = min(
                self.BLOCKSIZE,
                bytes_in_file - total_bytes_scanned)
            self.seek( -(byte_block + total_bytes_scanned), 2)
            total_bytes_scanned += byte_block
            lines_found += self.read(self.BLOCKSIZE).count('\n')
        self.seek(-total_bytes_scanned, 2)
        line_list = list(self.readlines())
        return line_list[-lines_2find:]

    def backward(self):
        self.seek(0, 2)                         #Go to end of file
        blocksize = self.BLOCKSIZE
        last_row = ''
        while self.tell() != 0:
            try:
                self.seek(-blocksize, 1)
            except IOError:
                blocksize = self.tell()
                self.seek(-blocksize, 1)
            block = self.read(blocksize)
            self.seek(-blocksize, 1)
            rows = block.split('\n')
            rows[-1] = rows[-1] + last_row
            while rows:
                last_row = rows.pop(-1)
                if rows and last_row:
                    yield last_row
        yield last_row


# with open(in_file1,"r") as f1, open(in_file2,"r") as f2:
#     for (line1, line2) in izip(f1, f2):
#         compare(line1, line2)