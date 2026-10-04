package com.kusukanime.data;

import P3.m;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.kusukanime.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/kusukanime/data/GoogleAuth;", "", "<init>", "()V", "REDIRECT", "", "authorizeUrl", "open", "", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GoogleAuth {
    public static final int $stable = 0;
    public static final GoogleAuth INSTANCE = new GoogleAuth();
    public static final String REDIRECT = "kusukanime://login-callback";

    private GoogleAuth() {
    }

    public final String authorizeUrl() {
        Object objSubSequence;
        char[] cArr = {'/'};
        int i7 = 39;
        while (true) {
            int i8 = i7 - 1;
            if (!m.S(cArr, BuildConfig.SUPABASE_URL.charAt(i7))) {
                objSubSequence = BuildConfig.SUPABASE_URL.subSequence(0, i7 + 1);
                break;
            }
            if (i8 < 0) {
                objSubSequence = "";
                break;
            }
            i7 = i8;
        }
        return objSubSequence.toString() + "/auth/v1/authorize?provider=google&redirect_to=" + Uri.encode(REDIRECT);
    }

    public final boolean open(Context context) {
        l.f("context", context);
        try {
            String strAuthorizeUrl = authorizeUrl();
            CrashLog.INSTANCE.saveDiag(context, "oauth-open: " + strAuthorizeUrl + "\nintent dibuat, mencoba startActivity");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strAuthorizeUrl));
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            try {
                CrashLog.INSTANCE.saveDiag(context, "oauth-open GAGAL: " + th.getClass().getName() + ": " + th.getMessage());
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
