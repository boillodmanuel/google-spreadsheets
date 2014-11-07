package org.restlet.gdata;

import com.google.gdata.client.docs.DocsService;
import com.google.gdata.client.spreadsheet.FeedURLFactory;
import com.google.gdata.client.spreadsheet.SpreadsheetService;
import com.google.gdata.data.PlainTextConstruct;
import com.google.gdata.data.spreadsheet.CellEntry;
import com.google.gdata.data.spreadsheet.CellFeed;
import com.google.gdata.data.spreadsheet.ListEntry;
import com.google.gdata.data.spreadsheet.ListFeed;
import com.google.gdata.data.spreadsheet.SpreadsheetEntry;
import com.google.gdata.data.spreadsheet.SpreadsheetFeed;
import com.google.gdata.data.spreadsheet.WorksheetEntry;
import org.junit.Before;
import org.junit.Test;

import java.net.URL;

/**
 * @author Manuel Boillod
 */

public class SpreadsheetsTests {

    DocsService docsService;
    SpreadsheetService service;
    FeedURLFactory urls;
    URL docsFeedUrls;

    @Before
    public void init() throws Exception {
        //get username and password from system properties
        String username = System.getProperty("username");
        String password = System.getProperty("password");

        //Authorizing requests with ClientLogin
        service = new SpreadsheetService("spreadsheetservice");
        service.setUserCredentials(username, password);

        docsService = new DocsService("docsservice");
        docsService.setUserCredentials(username, password);

        urls = FeedURLFactory.getDefault();
        docsFeedUrls = new URL("https://docs.google.com/feeds/default/private/full/");
    }
}
