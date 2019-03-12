package mil.nga.geopackage.extension.style;

import mil.nga.geopackage.attributes.AttributesDao;
import mil.nga.geopackage.attributes.AttributesResultSet;
import mil.nga.geopackage.attributes.AttributesRow;

/**
 * Style DAO for reading style tables
 * 
 * @author osbornb
 * @since 3.2.0
 */
public class StyleDao extends AttributesDao {

	/**
	 * Constructor
	 * 
	 * @param dao
	 *            user custom data access object
	 */
	public StyleDao(AttributesDao dao) {
		super(dao.getDatabase(), dao.getDb(), dao.getAttributesDb(),
				new StyleTable(dao.getTable()));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StyleTable getTable() {
		return (StyleTable) super.getTable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StyleRow newRow() {
		return new StyleRow(getTable());
	}

	/**
	 * Get the style row from the current result set location
	 * 
	 * @param resultSet
	 *            result set
	 * @return style row
	 */
	public StyleRow getRow(AttributesResultSet resultSet) {
		return getRow(resultSet.getRow());
	}

	/**
	 * Get a style row from the attributes row
	 * 
	 * @param row
	 *            attributes row
	 * @return style row
	 */
	public StyleRow getRow(AttributesRow row) {
		return new StyleRow(row);
	}

	/**
	 * Query for the style row from a style mapping row
	 * 
	 * @param styleMappingRow
	 *            style mapping row
	 * @return style row
	 */
	public StyleRow queryForRow(StyleMappingRow styleMappingRow) {
		StyleRow styleRow = null;

		AttributesRow attributesRow = queryForIdRow(styleMappingRow
				.getRelatedId());
		if (attributesRow != null) {
			styleRow = getRow(attributesRow);
		}

		return styleRow;
	}

}
