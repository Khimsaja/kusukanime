package F;

import C2.C0034g;
import D.C0042b;
import D.C0053g0;
import H.S;
import H0.H;
import N0.C0476a;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import io.ktor.util.GzipHeaderFlags;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import z0.S0;

/* loaded from: classes.dex */
public final class E implements InputConnection {
    public final C0034g a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1993b;

    /* renamed from: c, reason: collision with root package name */
    public final C0053g0 f1994c;

    /* renamed from: d, reason: collision with root package name */
    public final S f1995d;

    /* renamed from: e, reason: collision with root package name */
    public final S0 f1996e;

    /* renamed from: f, reason: collision with root package name */
    public int f1997f;

    /* renamed from: g, reason: collision with root package name */
    public N0.w f1998g;

    /* renamed from: h, reason: collision with root package name */
    public int f1999h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2000i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2001j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f2002k = true;

    public E(N0.w wVar, C0034g c0034g, boolean z7, C0053g0 c0053g0, S s7, S0 s02) {
        this.a = c0034g;
        this.f1993b = z7;
        this.f1994c = c0053g0;
        this.f1995d = s7;
        this.f1996e = s02;
        this.f1998g = wVar;
    }

    public final void a(N0.i iVar) {
        this.f1997f++;
        try {
            this.f2001j.add(iVar);
        } finally {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [e4.k, kotlin.jvm.internal.m] */
    public final boolean b() {
        int i7 = this.f1997f - 1;
        this.f1997f = i7;
        if (i7 == 0) {
            ArrayList arrayList = this.f2001j;
            if (!arrayList.isEmpty()) {
                ((C) this.a.f741l).f1982c.invoke(P3.q.U0(arrayList));
                arrayList.clear();
            }
        }
        return this.f1997f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z7 = this.f2002k;
        if (!z7) {
            return z7;
        }
        this.f1997f++;
        return true;
    }

    public final void c(int i7) {
        sendKeyEvent(new KeyEvent(0, i7));
        sendKeyEvent(new KeyEvent(1, i7));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i7) {
        boolean z7 = this.f2002k;
        if (z7) {
            return false;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f2001j.clear();
        this.f1997f = 0;
        this.f2002k = false;
        C c2 = (C) this.a.f741l;
        int size = c2.f1989j.size();
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList arrayList = c2.f1989j;
            if (kotlin.jvm.internal.l.a(((WeakReference) arrayList.get(i7)).get(), this)) {
                arrayList.remove(i7);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z7 = this.f2002k;
        if (z7) {
            return false;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        boolean z7 = this.f2002k;
        if (z7) {
            return false;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z7 = this.f2002k;
        return z7 ? this.f1993b : z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i7) {
        boolean z7 = this.f2002k;
        if (z7) {
            a(new C0476a(String.valueOf(charSequence), i7));
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i8) {
        boolean z7 = this.f2002k;
        if (!z7) {
            return z7;
        }
        a(new N0.g(i7, i8));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        boolean z7 = this.f2002k;
        if (!z7) {
            return z7;
        }
        a(new N0.h(i7, i8));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z7 = this.f2002k;
        if (!z7) {
            return z7;
        }
        a(new N0.j());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i7) {
        N0.w wVar = this.f1998g;
        return TextUtils.getCapsMode(wVar.a.a, H.e(wVar.f6896b), i7);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i7) {
        boolean z7 = (i7 & 1) != 0;
        this.f2000i = z7;
        if (z7) {
            this.f1999h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return q0.c.i(this.f1998g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i7) {
        if (H.b(this.f1998g.f6896b)) {
            return null;
        }
        return P3.F.B(this.f1998g).a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i7, int i8) {
        return P3.F.C(this.f1998g, i7).a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i7, int i8) {
        return P3.F.D(this.f1998g, i7).a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i7) {
        boolean z7 = this.f2002k;
        if (z7) {
            z7 = false;
            switch (i7) {
                case R.id.selectAll:
                    a(new N0.v(0, this.f1998g.a.a.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z7;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i7) {
        int i8;
        boolean z7 = this.f2002k;
        if (z7) {
            z7 = true;
            if (i7 != 0) {
                switch (i7) {
                    case 2:
                        i8 = 2;
                        break;
                    case 3:
                        i8 = 3;
                        break;
                    case GzipHeaderFlags.EXTRA /* 4 */:
                        i8 = 4;
                        break;
                    case 5:
                        i8 = 6;
                        break;
                    case 6:
                        i8 = 7;
                        break;
                    case 7:
                        i8 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i7);
                        i8 = 1;
                        break;
                }
                ((C) this.a.f741l).f1983d.invoke(new N0.k(i8));
            } else {
                i8 = 1;
                ((C) this.a.f741l).f1983d.invoke(new N0.k(i8));
            }
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            i iVar = i.a;
            C0042b c0042b = new C0042b(4, this);
            iVar.a(this.f1994c, this.f1995d, handwritingGesture, this.f1996e, executor, intConsumer, c0042b);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z7 = this.f2002k;
        if (z7) {
            return true;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return i.a.b(this.f1994c, this.f1995d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z7) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i7) {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10 = this.f2002k;
        if (!z10) {
            return z10;
        }
        boolean z11 = false;
        boolean z12 = (i7 & 1) != 0;
        boolean z13 = (i7 & 2) != 0;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33) {
            z7 = (i7 & 16) != 0;
            z8 = (i7 & 8) != 0;
            boolean z14 = (i7 & 4) != 0;
            if (i8 >= 34 && (i7 & 32) != 0) {
                z11 = true;
            }
            if (z7 || z8 || z14 || z11) {
                z9 = z11;
                z11 = z14;
            } else if (i8 >= 34) {
                z9 = true;
                z11 = true;
                z7 = true;
                z8 = true;
            } else {
                z7 = true;
                z8 = true;
                z9 = z11;
                z11 = true;
            }
        } else {
            z7 = true;
            z8 = true;
            z9 = false;
        }
        z zVar = ((C) this.a.f741l).f1992m;
        synchronized (zVar.f2047c) {
            try {
                zVar.f2050f = z7;
                zVar.f2051g = z8;
                zVar.f2052h = z11;
                zVar.f2053i = z9;
                if (z12) {
                    zVar.f2049e = true;
                    if (zVar.f2054j != null) {
                        zVar.a();
                    }
                }
                zVar.f2048d = z13;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [O3.i, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z7 = this.f2002k;
        if (!z7) {
            return z7;
        }
        ((BaseInputConnection) ((C) this.a.f741l).f1990k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i7, int i8) {
        boolean z7 = this.f2002k;
        if (z7) {
            a(new N0.t(i7, i8));
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i7) {
        boolean z7 = this.f2002k;
        if (z7) {
            a(new N0.u(String.valueOf(charSequence), i7));
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i7, int i8) {
        boolean z7 = this.f2002k;
        if (!z7) {
            return z7;
        }
        a(new N0.v(i7, i8));
        return true;
    }
}
