const express = require("express");
const mysql = require("mysql");
const cors = require("cors");
const server = express();
server.use(express.json())
server.use(cors({
    origin:true,
    credentials:true
}));
const connect = mysql.createConnection({
    host:"consolekakao.com",
    user:"jws",
    password:"wlghks0326@",
    port:3306,
    database:"devserver"
})
server.get("/",(req,res)=>{
    res.send("hello!");
})

server.post("/register",(req,res)=>{
    connect.query(select count(*) as cnt from user where id="${req.body.id}",(err,result)=>{
        if(err) {
            console.log(err);
            return;
        }
        if(result[0].cnt != "0") {
            console.log(result.length)
            res.send("이미 존재하는 아이디입니다.");
            return;
        }
        connect.query(insert into user (id,pw,name) values ("${req.body.id}","${req.body.pw}","${req.body.name}"))
        res.send({status:1});
    })
})

server.post("/login",(req,res)=>{
    console.log("server in",req.body)
    connect.query(select * from user where id="${req.body.id}",(err,result)=>{
        if(err) {
            console.log(err);
            return;
        }

        if(!(result[0])) {
            res.send({
                status:0
            });
            return;
        }

        if(req.body.pw != result[0]?.pw) {
            res.send({
                status:1
            });
            return;
        }

        res.send({
            status:2,
            data:result
        });
        return;

    })
})

server.listen(4545,()=>{
    console.log("server ON!!");
})