def insertionSort(nxlist):
   for index in range(1,len(nxlist)):

     currentvalue = nxlist[index]
     position = index

     while position>0 and nxlist[position-1]>currentvalue:
         nxlist[position]=nxlist[position-1]
         position = position-1

     nxlist[position]=currentvalue

nxlist = [15,36,13,227,527,421,452,211,702]

insertionSort(nxlist)

print(nxlist)