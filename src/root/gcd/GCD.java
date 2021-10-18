/**
 * Copyright (c) 2009 ISP RAS.
 * 109004, A. Solzhenitsina, 25, Moscow, Russia.
 * All rights reserved.
 *
 * $Id$
 * Created on Dec 22, 2015
 *
 */

package root.gcd;

/**
 * @author Victor Kuliamin
 *
 */
public class GCD
{
    public long gcd(int x, int y)
    {
        int t;
        if (x==Integer.MIN_VALUE && x==y)
            return -(long)Integer.MIN_VALUE;
        if (x==Integer.MIN_VALUE)
            x=1073741824;
        if (y==Integer.MIN_VALUE)
            y=1073741824;
        if(x < 0) x = -x;
        if(y < 0) y = -y;

        while(y != 0)
        {
            if(y > x)
            {
                x = y-x;
                y = y-x;
                x = x+y;
            }

            if(y == 0) return x;

            t = y;
            y = x%y;
            x = t;
        }
        return x;
    }


}
