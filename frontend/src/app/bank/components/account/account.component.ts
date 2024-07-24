import { AccountTS } from "../../types/tstypes/Accountts";

export class AccountComponent {
    account:any=AccountTS;
    constructor(){
        this.account=new AccountTS("2",6559.00,'2');  
    }

 

}
