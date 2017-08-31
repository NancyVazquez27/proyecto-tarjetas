
/**
 * Esta clase fue creada con la finalidad de simular una tarjeta 
 * en la cual se encuentra una varible de instancia privada saldo.
 * Este saldo se inicializa en 0.
 * 
 * @author Nancy Vazquez
 * @version 08.24.17
 * 
 */
public class Tarjeta
{
   private float saldo;
   
   public Tarjeta()
   {
       saldo=0;
    }
   /**
    * Este metodo de modificacion permite ingresar dinero ala tarjeta, siempre
    * y cuando esta cantidad sea positiva, 
    * @param recibe como parametro la variable dinero
    * No retorna nada
    * 
    */ 
    public void depositar(float dinero)
    {
    if(dinero>0)
        {   
            saldo=saldo+dinero;
        }
    }
    /**
     * Este metodo de modificacion permite retirar cierta cantidad de el objeto
     * tarjeta siempre y cuandp el valor de la variable saldo se mayor o igual ala 
     * cantidad que se desea retirar.
     * @param Recibe como parametro la varible dinero
     * @return Retorna el saldo una vez que se pudo retirar.
     * @ return Si el saldo de la tarjeta no es mayor o igual al dinero a retirar retornara 0.
     * 
     */
    public float retirar(float dinero)
    {
        if(saldo>=dinero)
        {
            saldo=saldo-dinero;
            return(saldo);
        }
       else
        {
            return(saldo);
        }
    }
    /**
     * Este metodo de acceso consulta el saldo de la tarjeta.
     * No recibe parametros
     * @ return El valor de la varible saldo.
     */
    public float consultar()
    {
         return(saldo);
    }
}