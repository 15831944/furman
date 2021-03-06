package by.dak.cutting.doors.mech.db;

import by.dak.cutting.doors.mech.DoorColor;
import by.dak.cutting.doors.mech.DoorMechDef;
import by.dak.persistence.dao.impl.GenericDaoImpl;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: vishutinov
 * Date: 26.08.2009
 * Time: 16:02:34
 * To change this template use File | Settings | File Templates.
 */
public class DoorColorDaoImpl extends GenericDaoImpl<DoorColor> implements DoorColorDao
{
    @Override
    public List<DoorColor> findAllBy(DoorMechDef doorMechDef)
    {
        return findByCriteria(Restrictions.eq("doorMechDef", doorMechDef));
    }
}
