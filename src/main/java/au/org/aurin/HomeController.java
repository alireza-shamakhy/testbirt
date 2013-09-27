package au.org.aurin;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);


	    BirtView bv = new BirtView();
	    bv.setReportFormatRequestParameter("TopNPercent.rptdesign");
	    bv.setReportNameRequestParameter("TopNPercent.rptdesign");

	    BirtEngineFactory factory = new BirtEngineFactory() ;
	     factory.setLogLevel( Level.FINEST);
	     factory.setLogDirectory ( new File ("/tmp/logs"));

	    bv.setBirtEngine( factory.getObject());

	    model.addAttribute("report", bv);

	    return "home";
   }
}
