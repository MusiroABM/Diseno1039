public abstract class AsciiArt
{
    protected String[]	lineas	=	{"XX",	"XX"};
    public	int getAncho()	{
        int max=0;
        for(String line:lineas)
            if(line.length()>max)
                max=line.length();

        return	max;
    }
    public	int getAlto()	{	return lineas.length;	}
    public	String[]	getLineas()	{	return lineas;	}
}