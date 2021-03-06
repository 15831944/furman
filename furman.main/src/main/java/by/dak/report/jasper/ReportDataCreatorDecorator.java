package by.dak.report.jasper;

import by.dak.utils.Decorator;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Denis Koyro
 * @version 0.1 22.03.2009
 * @introduced [Furniture constructor | Iteration 1]
 * @since 1.0.0
 */
public class ReportDataCreatorDecorator implements ReportDataCreator, Decorator<ReportDataCreator>
{
    private ReportDataCreator underlyingCreator;

    protected ReportDataCreatorDecorator()
    {
    }

    public ReportDataCreatorDecorator(ReportDataCreator underlyingCreator)
    {
        this.underlyingCreator = underlyingCreator;
    }

    public JReportData create()
    {
        return getUnderlying().create();
    }

    public Locale getLocale()
    {
        return getUnderlying().getLocale();
    }

    public ResourceBundle getResourceBundle()
    {
        return getUnderlying().getResourceBundle();
    }

    public ReportDataCreator getUnderlying()
    {
        return underlyingCreator;
    }

    protected void setUnderlying(ReportDataCreator underlyingCreator)
    {
        this.underlyingCreator = underlyingCreator;
    }

}
