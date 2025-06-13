
import './App.css';
import Rform from './form1.js'


function App() {
  return (
    <div className="App">
       <header className="App-header">
        <Rform/>
        
      </header> 
     
          </div>
  );
}

export default App;
function Rform()
{
    return(
       <div>
      <h1 align="center"><big>SVIET Registration Form</big></h1>
         <form action="loginform.html" target="_blank">
        <fieldset>
            <legend>registration form</legend>
            <label>Full name:<spam style={{color:'brown'}}>*</spam></label>
            <input type="text" placeholder="enter as per SCC" autofocus/><br/><br/>
            <label for="">Date of birth :<spam style={{color:'brown'}}>*</spam></label>
            <input type="number" placeholder="enter number" /><br/><br/>
            <label>Gender:</label>
            <input type="radio" name="t" id="1"/>
            <label for="1">Female</label>
            <input type="radio" name="t" id="2"/>
            <label for="2">Male</label>
            <input type="radio" name="t" id="3"/>
            <label for="3">Others</label><br/><br/>                 
            <label>Mother name :<spam style={{color:'brown'}}>*</spam></label>
            <input type="text" placeholder="enter your mother name as per SSC"/><br/><br/>
            <label>Father name:<spam style={{color:'brown'}}>*</spam></label>
            <input type="text" placeholder="enter your father name"  required/><br/><br/>
            <label>gardien name:</label>
            <input type="text" placeholder="enter your gardien name"  required/><br/><br/>
            <label>Mobile no :<spam style={{color:'brown'}}>*</spam></label>
            <input type="number" placeholder="enter mobile number"/><br/><br/>
            <label>Email id :<spam style={{color:'brown'}}>*</spam></label>
            <input type="email" placeholder="enter email" required/><br/><br/>
            <label>address of student :</label>
            <textarea type="text"></textarea><br/><br/>
            <laber>Inter :<spam style={{color:'brown'}}>*</spam></laber>
            <input type="text"/><br/><br/>
            <label>Branch</label>
            <select name="" id="">
                <option value=""></option>
                <option value="MPC">MPC</option>
                <option value="BiPC">BiPC</option>
                <option value="CEC">CEC</option>
            </select><br/><br/>
            <label>Inter marks memo<b>:</b><spam style={{color:'brown'}}>*</spam></label>
            <input type="file" /><br/><br/>
            <label>address of college<b>:</b></label>
            <textarea type="text"></textarea><br/><br/>
            <laber>Tenth:<spam style={{color:'brown'}}>*</spam></laber>
            <input type="text"/><br/><br/>
            <label>Tenth marks memo<b>:</b><spam style={{color:'brown'}}>*</spam></label>
            <input type="file" /><br/><br/>
            <label>address of School<b>:</b></label>
            <textarea type="text"></textarea><br/><br/>
            <label>terms and conditions</label>
            <input type="checkbox" name="s" id=""/><br/><br/>
            <label>notifications</label>
            <input type="checkbox" name="s" id=""/><br/><br/>
            <button type="submit">register</button>
        </fieldset>
    </form>
    </div>
    )
}


export default Rform;
