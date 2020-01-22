package np.raju.design.patterns.utils;

import java.util.logging.Logger;

/** @author raju.dhital@citytech.global on 2020-01-22 19:25 project design-patterns */
public class LoggerUtils {

  private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

  private LoggerUtils() {}

  public static void log(Object message) {
    LOGGER.info((String) message);
  }
}
