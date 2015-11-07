package com.spread;

import com.google.gdata.client.spreadsheet.SpreadsheetService;
import com.google.gdata.data.spreadsheet.ListEntry;
import com.google.gdata.data.spreadsheet.ListFeed;
import com.google.gdata.data.spreadsheet.SpreadsheetEntry;

import java.net.URL;

public class SpreadSheetContent {
	public static final String GOOGLE_ACCOUNT_USERNAME = "priyankayv93@gmail.com"; 
    public static final String GOOGLE_ACCOUNT_PASSWORD = "suppyv@2015"; 

    public static final String SPREADSHEET_URL = "https://docs.google.com/spreadsheets/d/16fkg_R6g0SpClt4cbBv04O_fAee9w11qa4qGH8z2R_U/edit#gid=0";



    public String getData(){
        String status="";

    try{
        SpreadsheetService service = new SpreadsheetService("Print Google Spreadsheet Demo");

        // Login and prompt the user to pick a sheet to use.
        service.setUserCredentials(GOOGLE_ACCOUNT_USERNAME,
                GOOGLE_ACCOUNT_PASSWORD);

        // Load sheet
        URL metafeedUrl = new URL(SPREADSHEET_URL);
        SpreadsheetEntry spreadsheet = service.getEntry(metafeedUrl,SpreadsheetEntry.class);
        URL listFeedUrl = spreadsheet.getWorksheets().get(0).getListFeedUrl();

        // Print entries
        ListFeed feed = service.getFeed(listFeedUrl, ListFeed.class);

        for (ListEntry entry : feed.getEntries()) {
            System.out.println("new row");
            for (String tag : entry.getCustomElements().getTags()) {
                System.out.println("     " + tag + ": "
                        + entry.getCustomElements().getValue(tag));
                status=entry.getCustomElements().getValue(tag);

            }
        }

    }catch(Exception e){
        System.out.println(e);
    }
    System.out.println(status);
    return(status);
    }
}
