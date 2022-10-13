def heapify(arr, n, i):
    largest = i 
    l = 2 * i + 1     
    r = 2 * i + 2    
 
    if l < n and arr[largest] < arr[l]:
        largest = l
   
    if r < n and arr[largest] < arr[r]:
        largest = r
 
    if largest != i:
        arr[i], arr[largest] = arr[largest], arr[i]  # swap
        heapify(arr, n, largest)
 
 
 
def heapSort(arr):
    n = len(arr)
 
    #  maxheap.
    for i in range(n//2 - 1, -1, -1):
        heapify(arr, n, i)
 
    # One by one extract 
    for i in range(n-1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]  # swap
        heapify(arr, i, 0)
 

arr = [123, 141, 1233, 52, 62, 27,23]
num = len(arr)
print("before Sort ---")
for i in range(num):
    print("%d" % arr[i]),

heapSort(arr)
n = len(arr)
print("Sorted ---")
for i in range(n):
    print("%d" % arr[i]),
