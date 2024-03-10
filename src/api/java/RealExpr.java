/**
Copyright (c) 2012-2014 Microsoft Corporation
   
Module Name:

    RealExpr.java

Abstract:

Author:

    @author Christoph Wintersteiger (cwinter) 2012-03-15

Notes:
    
**/ 

package com.microsoft.z3legacy;

/**
 * Real expressions
 **/
public class RealExpr extends ArithExpr
{
    /**
     * Constructor for RealExpr
     **/
    RealExpr(Context ctx, long obj)
    {
        super(ctx, obj);
    }
}
