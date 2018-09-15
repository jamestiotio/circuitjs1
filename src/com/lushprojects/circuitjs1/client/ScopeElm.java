/*    
    Copyright (C) Paul Falstad and Iain Sharp
    
    This file is part of CircuitJS1.

    CircuitJS1 is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 2 of the License, or
    (at your option) any later version.

    CircuitJS1 is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with CircuitJS1.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.lushprojects.circuitjs1.client;

import java.util.Vector;

class ScopeElm extends GraphicElm {

    public ScopeElm(int xx, int yy) {
	super(xx, yy);
	x2=x+100;
	y2=y+100;
	setPoints();
	noDiagonal=false;
    }
    
    public ScopeElm(int xa, int ya, int xb, int yb, int f,
		   StringTokenizer st) {
	super(xa, ya, xb, yb, f);
	setPoints();
	noDiagonal=false;
    }
  
    String dump() {
	return "";
    }
    
    int getDumpType() { return 'x'; }
    /*
    void drag(int xx, int yy) {
	x = xx;
	y = yy;
	x2 = xx+16;
	y2 = yy;
    }
    */
    
    void draw(Graphics g) {
	g.setColor(needsHighlight() ? selectColor : whiteColor);
	drawThickLine(g, point1, point2);
	setBbox(point1, point2, 0);
	drawPosts(g);

    }
    
}
