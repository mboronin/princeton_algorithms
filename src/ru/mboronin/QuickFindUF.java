package ru.mboronin;

/*
the value of each cell represents the union it is connected to
members of the same union have the same value
 */
public class QuickFindUF {
    private int id[];
    /*
    Constructor for N size
     */
    public void QuickFindUF(int N){
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
    }
    /*
    Check if p and q are connected
     */
    public boolean connected(int p, int q){
        return id[p] == id[q];
    }

    /*
    changes the value so the p is now a part of q
     */
    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++){
            if (id[i] == pid){
                id[i] = qid;
            }
        }
    }
}
