
# Java Servlet  – Week 1 Recap

## ✅ What We Covered Today

### 1. Introduction to Servlets

- Servlets are **Java programs** that run inside a **web container** (e.g., Tomcat).
- They handle **dynamic content** (user input, database results), while static content (HTML, CSS, images) is delivered directly.
- The **web container** manages servlet lifecycle, request/response handling, and mappings.
- **web.xml** is used to configure servlet mappings (connects URL patterns to specific servlet classes).

---

### 2. Eclipse IDE and Tomcat Setup

- We set up **Eclipse** with **Apache Tomcat**.
- Learned how to run and test servlets directly from the IDE.

---

### 3. Servlet Web Project

- Created a **Dynamic Web Project** in Eclipse.
- Added an `index.html` form to interact with the servlet.
- Learned about the **action** attribute (where to send form data) and the **method** attribute (GET/POST).

---

### 4. Creating a Servlet

- A servlet is created by extending **`HttpServlet`**.
- Main methods:
  - **doGet()** → handles GET requests.
  - **doPost()** → handles POST requests.
- Objects:
  - **HttpServletRequest** → carries client data.
  - **HttpServletResponse** → sends responses back.
- Example: using `PrintWriter` to write output to the browser.

---

### 5. HTTP Methods

- **GET** → fetch data.
- **POST** → create data.
- **PUT** → update entire record.
- **PATCH** → update partial record.
- **DELETE** → remove data.
- **OPTIONS** → check available communication methods.

---

### 6. RequestDispatcher

- Used to **forward a request** from one servlet to another page/servlet.
- Allows us to separate **business logic** (in servlet) from **presentation** (in JSP/HTML).

---

## 📝 Class Assignment

Form:  

- Input: First Name, Last Name, Age  

Servlet (`HandleUserInfo`):  

- Display:  
  - `"Hello {FirstName} {LastName}"`  
  - If `age > 18`: “You are adult.”  
  - Else: “You are young.”  

### Example Output

```txt
Hello, Abdoulaye Zakaria. You are adult.
````

---

## 🚀 3-Day Project: User Validation Servlet

### Task

Create a **form + servlet** that validates user info and performs checks.

### Form (index.html)

- Username (text)
- Age (number)
- Favorite Number (number)

### Servlet (UserValidationServlet.java)

- If **username is empty** → show:

  ```txt
  Please enter a valid username.
  ```

- Else if **age < 18** → show:

  ```txt
  Hello [username], you are still a minor.
  ```

- Else (age ≥ 18) → show:

  ```txt
  Hello [username], you are adult.
  ```

- Check **favorite number**:

  - If even → show: `Your favorite number X is even.`
  - If odd → show: `Your favorite number X is odd.`

### Example Output

```txt
Hello Amina, you are adult.
Your favorite number 27 is odd.
```

---

### 🎯 Goal

- Reinforce **servlet basics**: doGet, doPost, RequestDispatcher
- Practice **Java fundamentals**: string checks, conditionals, modulus operator `%`
- Strengthen skills in **form handling** with servlets

---

### 📅 Deadline

**Due in 3 days – Friday before Sabbath.**
