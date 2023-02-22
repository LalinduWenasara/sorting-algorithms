# Shell Sort in Python

def shell_sort(array):
    gap = len(array) // 2
    while gap > 0:
        for i in range(gap, len(array)):
            temp = array[i]
            j = i
            while j >= gap and array[j - gap] > temp:
                array[j] = array[j - gap]
                j -= gap
            array[j] = temp
        gap //= 2


if __name__ == "__main__":
    array = [12, 34, 54, 2, 3]
    shell_sort(array)
    print(array)
