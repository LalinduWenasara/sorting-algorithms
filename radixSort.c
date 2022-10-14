// Radix Sort in C (using Counting Sort)

#include <stdio.h>

// Function to get maximum of an array
int getMax(int array[], int n) {
    int maximum = array[0];
    for(int i = 1; i < n; i++)
        if(array[i] > maximum)
            maximum = array[i];
    return maximum;
}

// Counting sort
void countingSort(int array[], int size, int place) {
    int output[size + 1];
    int maximum = (array[0] / place) % 10;

    // Maximum in array
    for(int i = 1; i < size; i++) {
        if(((array[i] / place) % 10) > maximum)
            maximum = array[i];
    }

    int count[maximum + 1];

    // Initializing elements of count to zero
    for(int i = 0; i < maximum; ++i)
        count[i] = 0;
    
    // Count of values
    for(int i = 0; i < size; i++)
        count[(array[i] / place) % 10]++;
    
    // Cumulative count
    for(int i = 1; i < 10; i++)
        count[i] += count[i - 1];

    // Output array
    for(int i = size - 1; i >= 0; i--) {
        output[count[(array[i] / place) % 10] - 1] = array[i];
        count[(array[i] / place) % 10]--;
    }
    
    // Saving back to the original array
    for(int i = 0; i < size; i++)
        array[i] = output[i];
}

// Radix Sort function
void radixSort(int array[], int size) {
    int maximum = getMax(array, size);

    for(int place = 1; maximum / place > 0; place *= 10)
        countingSort(array, size, place);
}

// Function to print elements of an array
void printArray(int array[], int size) {
    for(int i = 0; i < size; i++) {
        printf("%d ", array[i]);
    }
    printf("\n");
}

// Driver code
int main() {

    int array[] = {172, 49, 111, 41, 79};
    int n = sizeof(array) / sizeof(array[0]);
    radixSort(array, n);
    printf("Sorted array ");
    printArray(array, n);

    return 0;
}
