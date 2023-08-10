export class Recharge {
    voucher_id: string;         
    recharge_amount: number;   
    msisdn: string;            
    date_recharge: Date;       

    constructor(voucher_id: string, recharge_amount: number, msisdn: string, date_recharge: Date) {
        this.voucher_id = voucher_id;
        this.recharge_amount = recharge_amount;
        this.msisdn = msisdn;
        this.date_recharge = date_recharge;
    }
}
