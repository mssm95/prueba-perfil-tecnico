package com.gkudos.test.ejercicio3;

public class BinarySearchTreeValidator {
    
    public int getMayor(Node node){
        int mayor=node.data;
        if(node.left!=null)
            if(mayor<getMayor(node.left)){
                mayor=getMayor(node.left);
            }
        if(node.right!=null)
            if(node.right==null || mayor<getMayor(node.right)){
                mayor=getMayor(node.right);
            }
        return mayor;
    }
    
    public boolean checkBST(Node node) {
        boolean cumpleCondicion=true;
        if(node!=null){
            if(node.left!=null){
                if(node.data<=getMayor(node.left))
                    cumpleCondicion=false;
            }
            if(node.right!=null){
                if(node.data>=getMayor(node.right))
                    cumpleCondicion=false;
            }
            return cumpleCondicion && checkBST(node.left) && checkBST(node.right);
        }else{
            return true;
        }
    }
    
    public static void main(String[] args) {
        BinarySearchTreeValidator arbolValidador = new BinarySearchTreeValidator();
        Node raiz=new Node();
        raiz.data=3;
        raiz.left=new Node();
        raiz.left.data=5;
        raiz.left.left=new Node();
        raiz.left.left.data=1;
        raiz.left.right=new Node();
        raiz.left.right.data=4;
        raiz.right=new Node();
        raiz.right.data=2;
        raiz.right.left=new Node();
        raiz.right.left.data=2;
        System.out.println(arbolValidador.checkBST(raiz));
        
        Node raiz2=new Node();
        raiz2.data=5;
        raiz2.left=new Node();
        raiz2.left.data=3;
        raiz2.left.left=new Node();
        raiz2.left.left.data=2;
        raiz2.left.right=new Node();
        raiz2.left.right.data=4;
        raiz2.right=new Node();
        raiz2.right.data=7;
        raiz2.right.left=new Node();
        raiz2.right.left.data=6;
        System.out.println(arbolValidador.checkBST(raiz2));
    }
}


