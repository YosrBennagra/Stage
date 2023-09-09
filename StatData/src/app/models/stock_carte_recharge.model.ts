export class StockCarteRecharge {
    mois: string;
    cdDist: string;
    mntRing: number;
    nombre: number;
    constructor(mois: string,cdDist: string,mntRing: number,nombre: number) 
    {
        this.mois = mois;
        this.cdDist = cdDist;
        this.mntRing = mntRing;
        this.nombre = nombre;
    }    
}
export interface StockCarteRechargePage {
    content: StockCarteRecharge[],
    totalPages: number,
    last: boolean,
    number: number
  }