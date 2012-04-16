/*
 * (C) 2012 Neo Visionaries Inc. All Rights Reserved.
 */
package com.neovisionaries.android.opengl;


/**
 * OpenGL shader type.
 *
 * @author Takahiko Kawasaki
 */
public enum ShaderType
{
    /**
     * Vertex shader (GL_VERTEX_SHADER).
     */
    VERTEX(GLESFactory.getInstance().GL_VERTEX_SHADER()),


    /**
     * Fragment shader (GL_FRAGMENT_SHADER).
     */
    FRAGMENT(GLESFactory.getInstance().GL_FRAGMENT_SHADER())
    ;


    /**
     * An integer representing a shader type.
     */
    private final int type;


    /**
     * A constructor with a shader type.
     *
     * @param type
     *         GL_VERTEX_SHADER or GL_FRAGMENT_SHADER.
     */
    private ShaderType(int type)
    {
        this.type = type;
    }


    /**
     * Get the integer representing the type of this shader.
     *
     * @return
     *         GL_VERTEX_SHADER or GL_FRAGMENT_SHADER.
     */
    public int getType()
    {
        return type;
    }
}