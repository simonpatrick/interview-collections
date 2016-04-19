# -*- coding: utf-8 -*-
"""

95
down vote
The python wiki is a great page for profiling resources: http://wiki.python.org/moin/PythonSpeed/PerformanceTips#Profiling_Code

as is the python docs: http://docs.python.org/library/profile.html

as shown by Chris Lawlor cProfile is a great tool and can easily be used to print to the screen:
"""
import cProfile
from pycallgraph import PyCallGraph
from pycallgraph.output import GraphvizOutput

def foo():
    counter = 0
    while 1 and counter < 10:
        print("test")
        counter += 1


if __name__ == '__main__':
    cProfile.run('foo()')
    with PyCallGraph(output=GraphvizOutput()):
        foo()