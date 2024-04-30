# Project Name: Merge Sort
## Questions & Answers

1. [16,21,11,8,12,22] → Merge Sort 

    ❓Write the stages of the sequence given above according to sort type.
        
    <aside>
        ✅ Answer:
        
        Step 1. [16,21,11,8,12,22]
        Step 2. [16,21,11]  [8,12,22]
        Step 3. [16]    [21,11]     [8] [12,22]
        Step 4. [16]    [21]    [11]    [8]    [12]    [22]
        Step 5. [16]    [11,21]     [8] [12,22]
        Step 6. [11,16,21]  [8,12,22]
        Step 7. [8,11,12,16,21,22]
        
    </aside>
        
    ❓Make the Big-O representation.
        
    <aside>
        ✅ Answer:
        
        O(logn)
        
    </aside>