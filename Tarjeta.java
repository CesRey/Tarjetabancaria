public class Tarjeta
{
    private float saldo;
    
    public void Depositar()
    {
    }

    public float Retirar(float quitarsaldo)
    {
        float saldoaretirar;
        saldo=saldo-quitarsaldo;
        return saldo;
    }
    
    public void consultar()
    {
        
    }
    
}
