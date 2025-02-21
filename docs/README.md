# Ninon User Guide

![image of Ui](https://github.com/CHI-ME/ip/blob/master/docs/Ui.png)

// Product intro goes here

## Adding todos

**Purpose:** 

Allows users to add todo task into the list.

---

**Command Format:**

```
todo [DESCRIPTION]
```

---

**Example Commands:**

```bash
todo Assignment 1
todo Group Meeting
```

---

**Parameters:**

1. **`DESCRIPTION`**
    - Brief description of the todo

---

**Outputs:**

- **Success:**
    - Displays the todo added
    - Displays the number of tasks in the list
    - UI updates to show the commands.
        
    - Example output:
        
        ```
        Got it. I've added this task: 
        [T][ ] Assignment 1
        Now you have 3 tasks in the list.
        ```
        
- **Error Messages:**
    - `OOPS!!! The description of a todo cannot be empty.` (If `[DESCRIPTION]` is missing)


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
    - Brief description of the deadline
2. **`DATE`**
    - Must follow the format `yyyy-mm-dd`, (e.g.,`2025-02-21`)

---

**Outputs:**

- **Success:**
    - Displays the deadline added
    - Displays the number of tasks in the list
    - UI updates to show the commands.
        
    - Example output:
        
        ```
        Got it. I've added this task:
        [D][ ] Assignment 1  (by: 2 21 2025)
        Now you have 2 tasks in the list.
        ```
        
- **Error Messages:**
    - `OOPS!!! The description of a deadline cannot be empty.` (If `[DESCRIPTION]` is missing)
    - `OOPS!!! The by of a deadline cannot be empty.` (If `[DATE]` is missing)
    - `date input format should be yyyy-mm-dd or date out of range` (If `[DATE]` is invalid)


## Adding events

**Purpose:** 

Allows users to add event task into the list.

---

**Command Format:**

```
event [DESCRIPTION] /from [DATE] /to [DATE]
```

---

**Example Commands:**

```bash
event Assignment 1 /from 2025-02-15 /to 2025-02-21
event AY2024-2025 sem 2 /from 2025-01-13 /to 2025-05-10
```

---

**Parameters:**

1. **`DESCRIPTION`**
    - Brief description of the event
2. **`DATE`**
    - Must follow the format `yyyy-mm-dd`, (e.g.,`2025-02-21`)

---

**Outputs:**

- **Success:**
    - Displays the event added
    - Displays the number of tasks in the list
    - UI updates to show the commands.
        
    - Example output:
        
        ```
        Got it. I've added this task:
        [E][ ] Assignment 1  (from: 2 15 2025 to: 2 21 2025)
        Now you have 5 tasks in the list.
        ```
        
- **Error Messages:**
    - `OOPS!!! The description of a event cannot be empty.` (If `[DESCRIPTION]` is missing)
    - `OOPS!!! The from of a event cannot be empty.` (If `[DATE]` after `/from` is missing)
    - `OOPS!!! The to of a event cannot be empty.` (If `[DATE]` after `/to` is missing)
    - `date input format should be yyyy-mm-dd or date out of range` (If `[DATE]` is invalid)


## Adding do-afters

**Purpose:** 

Allows users to add task that needed to done after specific task or date into the list.

---

**Command Format:**

```
doafter [DESCRIPTION] /by date [DATE]
doafter [DESCRIPTION] /by [DESCRIPTION]
```

---

**Example Commands:**

```bash
doafter Assignment 1 /by date 2025-02-15
doafter Assignment 2 /by Assignment 1
```

---

**Parameters:**

1. **`DESCRIPTION`**
    - Brief description of the do (and the after)
2. **`DATE`**
    - Must follow the format `yyyy-mm-dd`, (e.g.,`2025-02-21`)

---

**Outputs:**

- **Success:**
    - Displays the do-after added
    - Displays the number of tasks in the list
    - UI updates to show the commands.
        
    - Example output:
        
        ```
        Got it. I've added this task: 
        [A][ ] Assignment 1  (by: 2 15 2025)
        Now you have 7 tasks in the list.
        ```
        ```
        Got it. I've added this task: 
        [A][ ] Assignment 2  (by: [ ] Assignment 1)
        Now you have 8 tasks in the list.
        ```
        
- **Error Messages:**
    - `OOPS!!! The description of a do cannot be empty.` (If first `[DESCRIPTION]` is missing)
    - `OOPS!!! The description of an after cannot be empty.` (If `[DATE]` or `[DESCRIPTION]` after `/by` is missing)
    - `date input format should be yyyy-mm-dd or date out of range` (If `[DATE]` is invalid)
