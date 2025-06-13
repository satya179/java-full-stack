
import './App.css';
import Infro from'./info.js'
import Sviet from './sviet';

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
         <Sviet title=".........Emporwing minds"/>
      </header> 
      
     
          </div>
  );
}

export default App;
 export default function Sviet(props)
{
 return(
    <div>
        <h1>
         {props.title}
        </h1>
    </div>
 )   
}
