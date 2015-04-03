package mil.nga.giat.geopackage.test;

/**
 * Test constants
 * 
 * @author osbornb
 */
public class TestConstants {

	/**
	 * GeoPackage file extension
	 */
	public static final String GEO_PACKAGE_EXTENSION = "gpkg";

	/**
	 * Test database name
	 */
	public static final String TEST_DB_NAME = "test_db";

	/**
	 * Test database file name
	 */
	public static final String TEST_DB_FILE_NAME = TEST_DB_NAME + "."
			+ GEO_PACKAGE_EXTENSION;

	/**
	 * Import database name
	 */
	public static final String IMPORT_DB_NAME = "import_db";

	/**
	 * Import database file name, located in the test assets
	 */
	public static final String IMPORT_DB_FILE_NAME = IMPORT_DB_NAME + "."
			+ GEO_PACKAGE_EXTENSION;

	/**
	 * Import corrupt database name
	 */
	public static final String IMPORT_CORRUPT_DB_NAME = "import_db_corrupt";

	/**
	 * Import corrupt database file name, located in the test assets
	 */
	public static final String IMPORT_CORRUPT_DB_FILE_NAME = IMPORT_CORRUPT_DB_NAME
			+ "." + TestConstants.GEO_PACKAGE_EXTENSION;

	/**
	 * Tile file name extension
	 */
	public static final String TILE_FILE_NAME_EXTENSION = "png";

	/**
	 * Tile file name
	 */
	public static final String TILE_FILE_NAME = "tile."
			+ TILE_FILE_NAME_EXTENSION;

}
