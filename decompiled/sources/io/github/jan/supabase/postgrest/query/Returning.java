package io.github.jan.supabase.postgrest.query;

import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/postgrest/query/Returning;", "", "identifier", "", "<init>", "(Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "Minimal", "Representation", "Lio/github/jan/supabase/postgrest/query/Returning$Minimal;", "Lio/github/jan/supabase/postgrest/query/Returning$Representation;", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Returning {
    private final String identifier;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/postgrest/query/Returning$Minimal;", "Lio/github/jan/supabase/postgrest/query/Returning;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Minimal extends Returning {
        public static final Minimal INSTANCE = new Minimal();

        private Minimal() {
            super("minimal", null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Minimal);
        }

        public int hashCode() {
            return -1374471108;
        }

        public String toString() {
            return "Minimal";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lio/github/jan/supabase/postgrest/query/Returning$Representation;", "Lio/github/jan/supabase/postgrest/query/Returning;", "columns", "Lio/github/jan/supabase/postgrest/query/Columns;", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColumns-U9NzzuM", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-U9NzzuM", "copy", "copy-fYsiLaM", "(Ljava/lang/String;)Lio/github/jan/supabase/postgrest/query/Returning$Representation;", "equals", "", "other", "", "hashCode", "", "toString", "", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Representation extends Returning {
        private final String columns;

        public /* synthetic */ Representation(String str, f fVar) {
            this(str);
        }

        /* renamed from: copy-fYsiLaM$default, reason: not valid java name */
        public static /* synthetic */ Representation m30copyfYsiLaM$default(Representation representation, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = representation.columns;
            }
            return representation.m32copyfYsiLaM(str);
        }

        /* renamed from: component1-U9NzzuM, reason: not valid java name and from getter */
        public final String getColumns() {
            return this.columns;
        }

        /* renamed from: copy-fYsiLaM, reason: not valid java name */
        public final Representation m32copyfYsiLaM(String columns) {
            l.f("$v$c$io-github-jan-supabase-postgrest-query-Columns$-columns$0", columns);
            return new Representation(columns, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Representation) && Columns.m16equalsimpl0(this.columns, ((Representation) other).columns);
        }

        /* renamed from: getColumns-U9NzzuM, reason: not valid java name */
        public final String m33getColumnsU9NzzuM() {
            return this.columns;
        }

        public int hashCode() {
            return Columns.m17hashCodeimpl(this.columns);
        }

        public String toString() {
            return "Representation(columns=" + ((Object) Columns.m18toStringimpl(this.columns)) + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private Representation(String str) {
            super("representation", null);
            l.f("columns", str);
            this.columns = str;
        }

        public /* synthetic */ Representation(String str, int i7, f fVar) {
            this((i7 & 1) != 0 ? Columns.INSTANCE.m20getALLU9NzzuM() : str, null);
        }
    }

    public /* synthetic */ Returning(String str, f fVar) {
        this(str);
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    private Returning(String str) {
        this.identifier = str;
    }
}
