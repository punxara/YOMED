
import './App.css';

function App() {
  return (
  <body>
    <div>
      <nav>
          
      </nav>
      <ul>
      <li><a href="default.asp">Home</a></li>
      <li><a href="news.asp">Get Quantity</a></li>
      <li><a href="contact.asp">Order History</a></li>
      <li><a href="about.asp">Upcoming Weather</a></li>
      <li><a href="about.asp">Upcoming Weather 2</a></li>
      </ul>
      <p>
      LET US PREDICT YOUR MEDICINE QUANTITY!
      </p>
      
      <form>
        <label>
          Medicine Name:
         <input type="text" name="name" />
        </label>
        <br></br>
        <label>
          Location:
          <input type="text" name="name" />
        </label>
        <br></br>
          <input type="submit" value="PREDICT QUANTITY" />
        </form>
    </div>
    </body>
  );
}

export default App;
