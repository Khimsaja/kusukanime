package F0;

import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import l4.InterfaceC1443v;

/* loaded from: classes.dex */
public abstract class s {
    public static final /* synthetic */ InterfaceC1443v[] a;

    static {
        kotlin.jvm.internal.o oVar = new kotlin.jvm.internal.o(s.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1);
        z zVar = y.a;
        a = new InterfaceC1443v[]{zVar.f(oVar), A6.b.m(s.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1, zVar), A6.b.m(s.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, zVar), A6.b.m(s.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, zVar), A6.b.m(s.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, zVar), A6.b.m(s.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, zVar), A6.b.m(s.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, zVar), A6.b.m(s.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1, zVar), A6.b.m(s.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, zVar), A6.b.m(s.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1, zVar), A6.b.m(s.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, zVar), A6.b.m(s.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, zVar), A6.b.m(s.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, zVar), A6.b.m(s.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, zVar), A6.b.m(s.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, zVar), A6.b.m(s.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, zVar), A6.b.m(s.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, zVar), A6.b.m(s.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1, zVar), A6.b.m(s.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, zVar), A6.b.m(s.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, zVar), A6.b.m(s.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1, zVar), A6.b.m(s.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1, zVar), A6.b.m(s.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1, zVar), A6.b.m(s.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, zVar), A6.b.m(s.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, zVar), A6.b.m(s.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1, zVar)};
        t tVar = q.a;
        t tVar2 = h.a;
    }

    public static final t a(String str) {
        t tVar = new t(str);
        tVar.f2155c = true;
        return tVar;
    }

    public static final t b(String str, e4.n nVar) {
        return new t(str, true, nVar);
    }

    public static void c(i iVar, e4.k kVar) {
        iVar.j(h.a, new a(null, kVar));
    }

    public static final void d(i iVar, String str) {
        t tVar = q.a;
        iVar.j(q.a, P3.r.H(str));
    }

    public static final void e(i iVar, int i7) {
        t tVar = q.f2146s;
        InterfaceC1443v interfaceC1443v = a[12];
        tVar.a(iVar, new f(i7));
    }

    public static final void f(i iVar) {
        t tVar = q.f2139l;
        InterfaceC1443v interfaceC1443v = a[6];
        tVar.a(iVar, Boolean.TRUE);
    }
}
