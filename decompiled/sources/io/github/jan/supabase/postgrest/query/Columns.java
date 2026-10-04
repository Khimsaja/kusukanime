package io.github.jan.supabase.postgrest.query;

import A6.b;
import P3.m;
import P3.q;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u000f"}, d2 = {"Lio/github/jan/supabase/postgrest/query/Columns;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "toString", "Companion", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Columns {
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String ALL = m14constructorimpl("*");

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00052\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0010\"\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u000e\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\u0004\b\u0011\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0016\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0007J\f\u0010\u0018\u001a\u00020\u000b*\u00020\u000bH\u0002R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lio/github/jan/supabase/postgrest/query/Columns$Companion;", "", "<init>", "()V", "ALL", "Lio/github/jan/supabase/postgrest/query/Columns;", "getALL-U9NzzuM", "()Ljava/lang/String;", "Ljava/lang/String;", "raw", "value", "", "raw-Y7uY_Gg", "(Ljava/lang/String;)Ljava/lang/String;", "list", "columns", "", "list-Y7uY_Gg", "([Ljava/lang/String;)Ljava/lang/String;", "", "(Ljava/util/List;)Ljava/lang/String;", LinkHeader.Parameters.Type, "T", "type-U9NzzuM", "clean", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private final String clean(String str) {
            Pattern patternCompile = Pattern.compile("\\s");
            l.e("compile(...)", patternCompile);
            ArrayList arrayList = new ArrayList(str.length());
            boolean z7 = false;
            for (int i7 = 0; i7 < str.length(); i7++) {
                char cCharAt = str.charAt(i7);
                if (cCharAt == '\"') {
                    z7 = !z7;
                }
                String strValueOf = String.valueOf(cCharAt);
                l.f("input", strValueOf);
                arrayList.add((!patternCompile.matcher(strValueOf).matches() || z7) ? Character.valueOf(cCharAt) : "");
            }
            return q.y0(arrayList, "", null, null, null, 62);
        }

        /* renamed from: getALL-U9NzzuM, reason: not valid java name */
        public final String m20getALLU9NzzuM() {
            return Columns.ALL;
        }

        /* renamed from: list-Y7uY_Gg, reason: not valid java name */
        public final String m22listY7uY_Gg(String... columns) {
            l.f("columns", columns);
            return Columns.m14constructorimpl(m.n0(columns, ",", null, null, null, 62));
        }

        /* renamed from: raw-Y7uY_Gg, reason: not valid java name */
        public final String m23rawY7uY_Gg(String value) {
            l.f("value", value);
            return Columns.m14constructorimpl(clean(value));
        }

        /* renamed from: type-U9NzzuM, reason: not valid java name */
        public final <T> String m24typeU9NzzuM() {
            l.k();
            throw null;
        }

        private Companion() {
        }

        /* renamed from: list-Y7uY_Gg, reason: not valid java name */
        public final String m21listY7uY_Gg(List<String> columns) {
            l.f("columns", columns);
            return Columns.m14constructorimpl(q.y0(columns, ",", null, null, null, 62));
        }
    }

    private /* synthetic */ Columns(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Columns m13boximpl(String str) {
        return new Columns(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m14constructorimpl(String str) {
        l.f("value", str);
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m15equalsimpl(String str, Object obj) {
        return (obj instanceof Columns) && l.a(str, ((Columns) obj).m19unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m16equalsimpl0(String str, String str2) {
        return l.a(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m17hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m18toStringimpl(String str) {
        return b.d(')', "Columns(value=", str);
    }

    public boolean equals(Object other) {
        return m15equalsimpl(this.value, other);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m17hashCodeimpl(this.value);
    }

    public String toString() {
        return m18toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m19unboximpl() {
        return this.value;
    }
}
