/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaGit;

/**
 *
 * @author ARNAUD KIMA
 */
public class MesFonctions {
    
    public int minimum(int a, int b){
		return Math.min(a,b);
	}

    public int maximum(int a, int b){
		return Math.max(a,b);
	}

    public int factorielle(int n){
	if(n==0){
            return 1;
	}else
            return (n*factorielle(n-1));
    }
    
}
