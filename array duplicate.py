def find_duplicates(nums):
    frequency = {}
    duplicates = []

    for num in nums:
        if num in frequency:
            frequency[num] += 1
        else:
            frequency[num] = 1

    for num, freq in frequency.items():
        if freq == 2:
            duplicates.append(num)

    return duplicates
