/*
 * (C) 2012 Neo Visionaries Inc. All Rights Reserved.
 */
package com.neovisionaries.android.opengl;


/**
 * Drawing mode for {@link ArrayDrawer} (glDrawArrays()) and
 * {@link ElementDrawer} (glDrawElements()).
 *
 * @author Takahiko Kawasaki
 *
 * @see ArrayDrawer
 * @see ElementDrawer
 * @see <a href="http://www.khronos.org/opengles/sdk/docs/man/xhtml/glDrawArrays.xml">glDrawArrays</a>
 * @see <a href="http://www.khronos.org/opengles/sdk/docs/man/xhtml/glDrawElements.xml">glDrawElements</a>
 */
public enum DrawingMode
{
    /**
     * GL_POINTS.
     */
    POINTS(GLESFactory.getInstance().GL_POINTS()),


    /**
     * GL_LINES.
     */
    LINES(GLESFactory.getInstance().GL_LINES()),


    /**
     * GL_LINE_STRIP.
     */
    LINE_STRIP(GLESFactory.getInstance().GL_LINE_STRIP()),


    /**
     * GL_LINE_LOOP.
     */
    LINE_LOOP(GLESFactory.getInstance().GL_LINE_LOOP()),


    /**
     * GL_TRIANGLES.
     */
    TRIANGLES(GLESFactory.getInstance().GL_TRIANGLES()),


    /**
     * GL_TRIANGLE_STRIP.
     */
    TRIANGLE_STRIP(GLESFactory.getInstance().GL_TRIANGLE_STRIP()),


    /**
     * GL_TRIANGLE_FAN.
     */
    TRIANGLE_FAN(GLESFactory.getInstance().GL_TRIANGLE_FAN())
    ;


    /**
     * The integer representing the drawing mode.
     */
    private final int mode;


    /**
     * A constructor with a drawing mode.
     *
     * @param mode
     *         An integer representing a drawing mode.
     */
    private DrawingMode(int mode)
    {
        this.mode = mode;
    }


    /**
     * Get the integer representing this drawing mode.
     *
     * @return
     *         The integer representing this drawing mode.
     */
    public int getMode()
    {
        return mode;
    }
}