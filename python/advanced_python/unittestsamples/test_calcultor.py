# -*- coding: utf-8 -*-
from unittest import TestCase

from advanced_python.unittestsamples.calculator import Calculator


class TestCalculator(TestCase):

    def setUp(self):
        self.calculator=Calculator()

    def test_add(self):
        result = self.calculator.add(1,2)
        self.assertEqual(result,3)

    def test_add_string(self):
        result= self.calculator.add('1','sd')
        self.assertEqual(result,'1sd')

    def test_add_list_exception(self):
        with self.assertRaises(TypeError) as context:
            result=self.calculator.add(['12','2'],'dd')
        print(context)
        self.assertEqual(TypeError,type(context.exception))
