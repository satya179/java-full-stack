
import './App.css';
import Infro from'./info.js'


function App() {
  return (
    <div className="App">
       <header className="App-header">
        <img src={"https://www.sviet.edu.in/wp-content/uploads/2023/05/SVIET-LOGO-Edited-1024x1024.png"} className="App-logo" alt="LOGO"/>
        <p>
         SRI VASAVI INSITITUTE OF ENGIREENING AND TECHNOLOGY,NANDAMURU
        </p>
        <a
          className="App-link"
          href="https://www.sviet.edu.in/"
          target="_blank"
          rel="noopener noreferrer"
        >
          know about SVIET
        </a>
        <Infro></Infro>
        </header> 
     </div>
  );
}

export default App;


function Infro()
{
    return(
        <h1>WELCOME TO SVIET</h1>
    );
}
export default Infro;
