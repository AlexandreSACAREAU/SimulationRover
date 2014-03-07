package model;


public class RoverParameters
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer vitesse;
    private Integer nbMs_parclick=0;
   
    
    
    public RoverParameters(Integer nbMs_parclick) {
	super();
	this.nbMs_parclick = nbMs_parclick;
	this.vitesse=0;
	
    }
    
    public Integer accelaration()
    {
	vitesse+=this.nbMs_parclick;
	return this.vitesse;
    }
    
    public Integer freiner(){
	vitesse-=nbMs_parclick;
	return this.vitesse;
    }
    
    public Integer getVitesse(){
	return vitesse;
    }
    
    
    
    
    
    
    
    
}
