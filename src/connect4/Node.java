package connect4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Clarity
 */
public class Node {
    Node ul, u, ur, l, r , dl, d, dr;
    int v;
    Node(){
        
    }

    public void setUl(Node ul) {
        this.ul = ul;
    }

    public void setU(Node u) {
        this.u = u;
    }

    public void setUr(Node ur) {
        this.ur = ur;
    }

    public void setL(Node l) {
        this.l = l;
    }

    public void setR(Node r) {
        this.r = r;
    }

    public void setDl(Node dl) {
        this.dl = dl;
    }

    public void setD(Node d) {
        this.d = d;
    }

    public void setDr(Node dr) {
        this.dr = dr;
    }

    public void setV(int v) {
        this.v = v;
    }

    
    
    
}
