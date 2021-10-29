let log_id
let log_pw
const getValueInput = () =>{
    log_id = document.getElementById("log_id").value;
    log_pw = document.getElementById("log_pw").value;
    console.log(log_id);
    x();
}


const x = () => {
    axios({
        method: 'post', //통신 방식
        url: 'http://localhost:4545/register', //통신할 페이지
        data:
            { id: log_id, pw: log_pw}

    })
        .then(response=>{
            console.log(response);
        })
        .catch(error=>{
            console.log(error);
        })
}
