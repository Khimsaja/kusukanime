package com.kusukanime.data;

import P3.q;
import P3.v;
import P3.y;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0005J\u0016\u0010\u0014\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/kusukanime/data/SearchHistory;", "", "<init>", "()V", "PREF", "", "KEY", "SEP", "MAX", "", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "ctx", "Landroid/content/Context;", "list", "", "add", "", "query", "remove", "clear", "save", "items", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SearchHistory {
    public static final int $stable = 0;
    public static final SearchHistory INSTANCE = new SearchHistory();
    private static final String KEY = "search_history_v1";
    private static final int MAX = 12;
    private static final String PREF = "kusu_settings";
    private static final String SEP = "\u001f";

    private SearchHistory() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean add$lambda$0(String str, String str2) {
        l.f("it", str2);
        return str2.equalsIgnoreCase(str);
    }

    private final SharedPreferences prefs(Context ctx) {
        return ctx.getSharedPreferences(PREF, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean remove$lambda$0(String str, String str2) {
        l.f("it", str2);
        return str2.equalsIgnoreCase(str);
    }

    private final void save(Context ctx, List<String> items) {
        prefs(ctx).edit().putString(KEY, q.y0(q.P0(items, MAX), SEP, null, null, null, 62)).apply();
    }

    public final void add(Context ctx, String query) {
        l.f("ctx", ctx);
        l.f("query", query);
        String string = AbstractC2510o.J0(query).toString();
        if (string.length() < 2) {
            return;
        }
        ArrayList arrayListU0 = q.U0(list(ctx));
        v.g0(new b(string, 1), arrayListU0);
        arrayListU0.add(0, string);
        save(ctx, arrayListU0);
    }

    public final void clear(Context ctx) {
        l.f("ctx", ctx);
        save(ctx, y.f7779k);
    }

    public final List<String> list(Context ctx) {
        l.f("ctx", ctx);
        String string = prefs(ctx).getString(KEY, "");
        String str = string != null ? string : "";
        if (AbstractC2510o.g0(str)) {
            return y.f7779k;
        }
        List listU0 = AbstractC2510o.u0(str, new String[]{SEP}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listU0) {
            if (!AbstractC2510o.g0((String) obj)) {
                arrayList.add(obj);
            }
        }
        return q.P0(arrayList, MAX);
    }

    public final void remove(Context ctx, String query) {
        l.f("ctx", ctx);
        l.f("query", query);
        ArrayList arrayListU0 = q.U0(list(ctx));
        v.g0(new b(query, 0), arrayListU0);
        save(ctx, arrayListU0);
    }
}
