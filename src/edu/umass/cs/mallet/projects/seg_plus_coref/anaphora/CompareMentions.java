/* Copyright (C) 2002 Dept. of Computer Science, Univ. of Massachusetts, Amherst

   This file is part of "MALLET" (MAchine Learning for LanguagE Toolkit).
   http://www.cs.umass.edu/~mccallum/mallet

   This program toolkit free software; you can redistribute it and/or
   modify it under the terms of the GNU General Public License as
   published by the Free Software Foundation; either version 2 of the
   License, or (at your option) any later version.

   This program is distributed in the hope that it will be useful, but
   WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  For more
   details see the GNU General Public License and the file README-LEGAL.

   You should have received a copy of the GNU General Public License
   along with this program; if not, write to the Free Software
   Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA
   02111-1307, USA. */


/**
	 @author Ben Wellner
 */

package edu.umass.cs.mallet.projects.seg_plus_coref.anaphora;

import java.util.Comparator;

// NOTE: This comparator imposes orderings inconsistent with equals
public class CompareMentions implements Comparator
{
    public CompareMentions ()
    {
    }

    public int compare (Object m1, Object m2)
    {
	int v1 = ((Mention)m1).getId();
	int v2 = ((Mention)m2).getId();
	if (v1 < v2)
	    return -1;
	else if (v1 > v2)
	    return 1;
	else
	    return 0;
    }

    public boolean equals (Object o)
    {
	return (o == this);
    }
}
