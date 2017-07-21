package com.reversedroid.crimainalintent;

import android.content.Context;

/**
 * Created by ARUN on 20-07-2017.
 */

public class CrimeLab {
    private  static  CrimeLab sCrimeLab;

    private CrimeLab(Context context){}
    public CrimeLab get(Context context){
        if(sCrimeLab==null ) {
            sCrimeLab = new CrimeLab(context);
        }
            return sCrimeLab;
    }

}
