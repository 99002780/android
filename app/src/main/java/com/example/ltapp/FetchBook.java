package com.example.ltapp;

    import android.os.AsyncTask;
   import android.widget.TextView;

    import org.json.JSONArray;
    import org.json.JSONException;
    import org.json.JSONObject;

public class FetchBook extends AsyncTask<String,Void,String> {

    private TextView mTitleText;
    private TextView mAuthorText;

    public FetchBook(TextView mTitleText, TextView mAuthorText) {
        this.mTitleText = mTitleText;
        this.mAuthorText = mAuthorText;
    }


    protected String doInBackground(String... params) {
        return NetworkUtils.getBookInfo(params[0]);
    }

    @Override
    /*protected void onPostExecute(String s) {
        {
            super.onPostExecute(s);*/
            protected void onPostExecute(String jsonString)
            {
                //super.onPostExecute(s);
                super.onPostExecute(jsonString);
                try {
                    //JSONObject jsonObject = new JSONObject(s);
                    JSONObject jsonObject = new JSONObject(jsonString);
                    JSONArray itemsArray = jsonObject.getJSONArray("items");
                    //Iterate through the results
                    for(int i = 0; i<itemsArray.length(); i++){
           /* try {
                JSONObject jsonObject = new JSONObject(s);
                JSONArray itemsArray = jsonObject.getJSONArray("items");
                //Iterate through the results*/

                    JSONObject book = itemsArray.getJSONObject(i); //Get the current item
                    String title = null;
                    String authors = null;
                    JSONObject volumeInfo = book.getJSONObject("volumeInfo");
                    try {
                        title = volumeInfo.getString("title");
                        authors = volumeInfo.getString("authors");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
//If both a title and author exist, update the TextViews and return
                    if (title != null && authors != null) {
                        mTitleText.setText(title);
                        mAuthorText.setText(authors);
                        return;
                    }
                }

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

