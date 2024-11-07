class Heapify{
    void maxHeapify(int a[],int badidx)
    {

        while(true)
        {
            int mxidx=badidx;
            int lci=2*mxidx+1;
            int rci=2*mxidx+2;
            if(a[mxidx]<a[lci] && lci<a.length) mxidx=lci;
            if(a[mxidx]<a[rci] && rci<a.length) mxidx=rci;
            if(mxidx!=badidx) {
                int t=a[badidx];
                a[badidx]=a[mxidx];
                 a[mxidx]=t;
                badidx=mxidx;
            }
            else break;

        }
    }


    void buildMaxHeap(int a[],int size)
    {
        for(int i=size/2-1;i>=0;i++)
            maxHeapify(a, i);
    }
}