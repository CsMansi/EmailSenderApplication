<h1>Email Sender Application</h1>

<p>
    This is a <strong>Spring Boot-based Email Sender Application</strong> that allows users to send emails through a simple and user-friendly interface.
    The backend is built with Spring Boot, and the frontend is developed using HTML, CSS, and JavaScript. This project supports Java 17 and integrates
    with <strong>SMTP</strong> for sending emails.
</p>

<h2>Features</h2>
<ul>
    <li>Send emails to any recipient.</li>
    <li>Simple frontend with a lightweight design.</li>
    <li>Secure SMTP authentication.</li>
    <li>Configurable SMTP settings via <code>application.properties</code>.</li>
    <li>Built for Java 17.</li>
</ul>

<h2>Project Structure</h2>
<pre>
EmailSender/
├── src/
│   ├── main/
│   │   ├── java/com/emailsender/
│   │   │   ├── EmailSenderApplication.java       # Main application file
│   │   │   ├── controller/EmailController.java   # REST API controller
│   │   │   ├── service/EmailService.java         # Email sending logic
│   │   ├── resources/
│   │   │   ├── application.properties            # Email configuration
│   │   ├── webapp/
│   │   │   ├── index.html                        # Frontend HTML
│   │   │   ├── styles.css                        # Frontend CSS
├── pom.xml                                       # Maven dependencies
</pre>

<h2>Prerequisites</h2>
<h3>Software Requirements:</h3>
<ul>
    <li>Java 17 or later installed.</li>
    <li>Maven installed.</li>
    <li>An email account for SMTP (e.g., Gmail, Outlook).</li>
</ul>

<h2>Setup Instructions</h2>
<h3>Clone the Repository</h3>
<pre>
git clone https://github.com/your-username/email-sender.git
cd email-sender
</pre>

<h3>Configure the SMTP Server</h3>
<ol>
    <li>Open the <code>src/main/resources/application.properties</code> file.</li>
    <li>Update the following properties with your email and password:
        <pre>
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your-email@gmail.com
spring.mail.password=your-app-password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
        </pre>
    </li>
    <li>
        For Gmail:
        <ul>
            <li>If you use <strong>2FA</strong>, create an <a href="https://support.google.com/accounts/answer/185833" target="_blank">App Password</a>.</li>
            <li>If not, enable "Less Secure Apps" in your <a href="https://myaccount.google.com/security-checkup" target="_blank">Google Account settings</a>.</li>
        </ul>
    </li>
</ol>

<h3>Build and Run the Application</h3>
<pre>
mvn clean install
mvn spring-boot:run
</pre>

<h3>Access the Frontend</h3>
<p>Open your browser and go to:</p>
<pre>
http://localhost:8080
</pre>
<p>Fill in the form with the recipient email, subject, and message, then click <strong>Send Email</strong>.</p>

<h2>API Endpoints</h2>
<h3>Send Email</h3>
<p><strong>POST</strong> <code>/api/email/send</code></p>

<h4>Request Parameters:</h4>
<table>
    <thead>
        <tr>
            <th>Parameter</th>
            <th>Type</th>
            <th>Description</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><code>to</code></td>
            <td>String</td>
            <td>Recipient email address</td>
        </tr>
        <tr>
            <td><code>subject</code></td>
            <td>String</td>
            <td>Email subject</td>
        </tr>
        <tr>
            <td><code>body</code></td>
            <td>String</td>
            <td>Email message body</td>
        </tr>
    </tbody>
</table>

<h4>Example Request:</h4>
<pre>
curl -X POST "http://localhost:8080/api/email/send" \
     -d "to=example@example.com&subject=Hello&body=Test message"
</pre>

<h4>Example Response:</h4>
<p><strong>Success:</strong></p>
<pre>
"Email sent successfully to example@example.com"
</pre>
<p><strong>Error:</strong></p>
<pre>
"Error sending email: Authentication failed"
</pre>

<h2>License</h2>
<p>This project is licensed under the MIT License. See the <code>LICENSE</code> file for details.</p>

<h2>Acknowledgements</h2>
<ul>
    <li><a href="https://spring.io/projects/spring-boot" target="_blank">Spring Boot Documentation</a></li>
    <li><a href="https://eclipse-ee4j.github.io/mail/" target="_blank">Jakarta Mail Documentation</a></li>
    <li><a href="https://support.google.com/accounts/answer/185833" target="_blank">Google App Password Guide</a></li>
</ul>

