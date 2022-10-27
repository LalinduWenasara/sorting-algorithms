# Count Sort in Python
def count_sort(arr):
    count = [0] * (max(arr) + 1)
    for num in arr:
        count[num] += 1
    i = 0
    for num in range(len(count)):
        for c in range(count[num]):
            arr[i] = num
            i += 1
    return arr


if __name__ == "__main__":
    arr = [1, 4, 1, 2, 7, 5, 2]
    print(count_sort(arr))
