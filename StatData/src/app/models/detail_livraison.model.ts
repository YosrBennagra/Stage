export class DetailLivraison {
    numSer: string;
    dateLiv: Date;
    dateFact: Date;
    mntRing: number;
    cdDist: string;
    recharge: string;
    msisdn: string;
    mntDt : number;
    dateRecharge: Date;
    flag1: string;
    flag2: string;
    flag3: string;
    flag4: string;
    constructor
    (numSer: string,dateLiv: Date,dateFact: Date,mntRing: number,cdDist: string,recharge: string,msisdn: string,mntDt: number,dateRecharge: Date,flag1: string,flag2: string,flag3: string,flag4: string) 
    {
        this.numSer = numSer;
        this.dateLiv = dateLiv;
        this.mntRing = mntRing;
        this.dateFact = dateFact;
        this.cdDist = cdDist;
        this.recharge = recharge;
        this.msisdn = msisdn;
        this.mntDt = mntDt;
        this.dateRecharge = dateRecharge;
        this.flag1 = flag1;
        this.flag2 = flag2;
        this.flag3 = flag3;
        this.flag4 = flag4;
    }
}
export interface DetailLivraisonPage {
    content: DetailLivraison[],
    totalPages: number,
    last: boolean,
    number: number
  }