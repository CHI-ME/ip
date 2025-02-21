# Ninon User Guide

![image of Ui](https://github.com/CHI-ME/ip/blob/master/docs/Ui.png)

// Product intro goes here

## Adding deadlines

**Purpose:** 

Allows users to add deadline task into the list.

---

**Command Format:**

```
deadline [DESCRIPTION] /by [DATE]
```

---

**Example Commands:**

```bash
deadline Assignment 1 /by 2025-02-21
deadline Group Meeting /by 2025-03-29
```

---

**Parameters:**

1. **`DESCRIPTION`**
    - Brief description of the task
2. **`DATE`**
    - Must follow the format `yyyy-mm-dd`, (e.g.,`2025-02-21`)

---

**Outputs:**

- **Success:**
    - Displays the task added
    - Displays the number of tasks in the list
    - UI updates to show the commands.
        
    - Example output:
        
        ```
        Got it. I've added this task:
        [D][ ] Assignment 1  (by: 2 21 2025)
        Now you have 2 tasks in the list.
        ```
        
- **Error Messages:**
    - `OOPS!!! The description of a todo cannot be empty.` (If `[DESCRIPTION]` is missing)
    - `OOPS!!! The by of a deadline cannot be empty.` (If `[DATE]` is missing)
    - `date input format should be yyyy-mm-dd or date out of range` (If `[DATE]` is invalid)


## Feature ABC

// Feature details


## Feature XYZ

// Feature details
