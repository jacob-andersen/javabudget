package com.codebyjake.javabudget;

import com.codebyjake.javabudget.model.Expense;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Expense expense = new Expense("Mortgage",1693,"03152021",4);
        System.out.println(expense.toString());
    }
}
